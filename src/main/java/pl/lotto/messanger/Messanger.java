package pl.lotto.messanger;

public class Messanger {

    HttpService httpService = new HttpService();


    public void makeMessage(String message) {
        System.out.println(message);
        httpService.callHttpService(message);

    }
}