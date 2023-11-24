package bank;
// Controller
public class AccountController {
    private BankReader reader; // input-view
    private BankWriter writer; // output-view
    private BankAccount account; // model

    /* AccountController 객체 초기
     * @param r - input-view 객체
     * @param w - output-view 객체
     * @param a - model 객체 */
    public AccountController(BankReader r, BankWriter w, BankAccount a) {
        reader = r;
        account = a;
        writer = w;
    }

    /* processTransactions - Q 요청을 할 때까지 고객의 요청을 처리 */
    public void processTransactions() {
        char command = reader.readCommand("입금 D금액, 출금 W금액, 종료 Q, 이자 E");
        if (command == 'Q') {
            writer.showTransaction("서비스를 마칩니다.");
            return;
        }
        else if (command == 'D') {
            int amount = reader.readAmount();
            if (account.deposit(amount))
                writer.showTransaction(amount, "입금 성공");
            else
                writer.showTransaction("입금 실패");
        }
        else if (command == 'W') {
            int amount = reader.readAmount();
            if (account.withdraw(amount))
                writer.showTransaction(amount, "출금 성공");
            else
                writer.showTransaction("출금 실패");
        }
        else if (command == 'E') {
            int percentage = reader.readAmount();
            int currentBalance = account.getBalance();
            if (account.earnInterest(percentage))
                writer.showTransaction(currentBalance * percentage / 100, "원의 이자를 받았습니다.");
            else
                writer.showTransaction("이자 지급 실패");
        }
        else
            writer.showTransaction("요청 오류");
        this.processTransactions();
    }
}


