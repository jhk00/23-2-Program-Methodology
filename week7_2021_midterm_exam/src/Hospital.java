import javax.swing.*;

public class Hospital {
    private Patient[] rooms; // 입원실 배열
    private int occupied; // 환자가 입실중인 입원실의 개수

    public Hospital(int n) { // 병원 객체 생성 초기화 메소드, n = 병원이 보유한 입원실의 개수
        rooms = new Patient[n];
        occupied = 0;
    }

    /**
     * 입원실 배열을 리턴한다.
     * @return
     */
    public Patient[] getRoomsInfo() {
        return rooms;
    } // 입원실 배열 리턴을 위해 참조형도 배열로 한게 포인트

    /** [1번 - 배점 2점]
     * 비어있는 입원실이 있는지 여부를 리턴한다.
     * @return
     */
    public boolean roomAvailable() {
         if(occupied < rooms.length) { return true;}
         else { return false;}
    }
    // 내가 쓴것도 맞긴 한데 c스타일로 occupied < rooms.length
    // 이렇게 써도 됨. ( 저게 맞으면 true 리턴, 틀리면 false 리턴)

    /** [2번 - 배점 5점]
     * 환자 등록번호 id로 입원 중인 환자를 찾는다.
     * @param id
     * @return 환자
     */
    public Patient findPatient(int id) {
       // Patient p;
        //for(int i = 0; i < rooms.length; i++) {
         //   if (id == rooms[i].getID())
          //      return rooms[i];
        //}
           //return null;
        for (int i = 0; i < rooms.length; i++) {
            Patient p = rooms[i];
            if (p != null && p.getID() == id) {
                return p;
            }
        }
        return null;
    }
    //클래스가 메소드의 타입으로 선언되면
    // 메소드 타입으로 클래스 이름을 사용하면, 이 메소드는 그 클래스로 생성된 객체의 참조값을 반환해요

    /** [3번 - 배점 5점]
     * 환자 p를 입실시킨다.
     * @param p
     * @return 빈 입원실이 있어서 입실 성공하면 true, 없어서 실패하면 false
     */
    public boolean admit(Patient p) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = p;
                occupied -= 1;
                return true;
            }
        }
        return false;
    }



    /** [4번 - 배점 5점]
     * 환자 p를 퇴실시킨다.
     * @param p
     * @return 환자를 찾아서 퇴실 성공하면 true, 실패하면 false
     */
    public boolean discharge(Patient p) {
        for(int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null && p.getID() == rooms[i].getID()) {
                rooms[i] = null;
                occupied++;
                return true;
            }
        }
        return false;
    }
}
