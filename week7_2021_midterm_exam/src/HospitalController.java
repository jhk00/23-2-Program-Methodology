public class HospitalController {
    private Hospital hospital; // 병원 객체
    private Displayer displayer; // 출력 객체
    private Reader reader; // 입력 객체
    private int new_id = 1001; // 신규 환자 등록번호, 1001 = 첫 환자의 등록번호

    public HospitalController(Hospital h, Displayer d, Reader r) {
        hospital = h;
        displayer = d;
        reader = r;
    }

    // 입원실 관리 서비스 (무한 루프)
    // [5번 - 배점 10점]
    public void manageRooms() {
        while (true) {
            double temperature;
            int bp_high, bp_low, id;
            Patient p;
            String input = reader.readMenu("+: 입실, -: 퇴실");

            if(input.charAt(0) == '+') {
                // input.charAt(0) == '+' 이렇게도 가능
                // 자바에서는 문자열을 비교하려면 equals() 메소드 사용
                // ==는 객체가 같은지를 비교하지만 객체가 갖고 있는 문자열을 비교하진 않기 때문이다.
                //  일단 뭐든 되는대로 하기 string은 equal 사용해서 비교하고 안되면 charAt, 따옴표
                // 붙였다 땠다 하면서 비교해보기
                if(hospital.roomAvailable() == true) {
                    temperature = reader.readDouble("체온?");
                    bp_high = reader.readInteger("혈압(상)?");
                    bp_low = reader.readInteger("혈압(하)?");
                    if(hospital.admit(new Patient(new_id,temperature,bp_high,bp_low)));
                    new_id++;
                }
                else {
                    displayer.showMessage("병실이 없습니다.");
                }
            }
            else {
                id = reader.readInteger("환자 번호?");
                p = hospital.findPatient(id);
                if(p == null) {
                    displayer.showMessage("id 환자를 찾을 수 없습니다.");
                }
                else {
                    hospital.discharge(p);
                    displayer.showMessage("id 환자를 퇴실 합니다.");
                }
            }
            displayer.display();
            // 1. + 또는 -를 입력 대화창에서 입력 받는다.
            // 2. + 이면 입실 관리
            //    빈 입원실이 있으면
            //        체온, 혈압(상), 혈압(하)를 차례로 입력 대화창에서 입력받아
            //        환자 객체를 만들고 입실시킨다.
            //    빈 입원실이 없으면,
            //        출력 메시지 창을 띄워 "병실이 없습니다."를 보여준다.
            // 3. - 이면 퇴실 관리
            //    퇴실할 환자의 등록번호 id로 환자의 입원실을 찾는다.
            //    해당 환자가 입원실에 없으면,
            //        출력 메시지 창을 띄워 "id 환자를 찾을 수 없습니다."를 보여준다.
            //    해당 환자가 입원실에 있으면,
            //        환자를 퇴원시키고,
            //        출력 메시지 창을 띄워 "id 환자 퇴실 합니다."를 보여준다.
        }
    }

}
