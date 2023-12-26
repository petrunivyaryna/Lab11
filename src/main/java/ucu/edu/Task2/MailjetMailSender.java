package ucu.edu.Task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.ClientOptions;
import com.mailjet.client.resource.Emailv31;

import ucu.edu.Task2.codes.LetterStrategy;

import org.json.JSONArray;
import org.json.JSONObject;

public class MailjetMailSender implements MailSender {

    @Override
    public void sendMail(MailInfo mailInfo) throws MailjetException, MailjetSocketTimeoutException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;

        LetterStrategy mailCode = mailInfo.getMailCode();

        client = new MailjetClient(System.getenv("MJ_APIKEY_PUBLIC"), System.getenv("MJ_APIKEY_PRIVATE"), new ClientOptions("v3.1"));

        request = new MailjetRequest(Emailv31.resource)
                .property(Emailv31.MESSAGES, new JSONArray()
                        .put(new JSONObject()
                                .put(Emailv31.Message.FROM, new JSONObject()
                                        .put("Email", "petruniv.pn@ucu.edu.ua")
                                        .put("Name", "Yaryna"))
                                .put(Emailv31.Message.TO, new JSONArray()
                                        .put(new JSONObject()
                                                .put("Email", mailInfo.getClient().getEmail())
                                                .put("Name", mailInfo.getClient().getName())))
                                .put(Emailv31.Message.SUBJECT, "Personalized Greeting")
                                .put(Emailv31.Message.TEXTPART, mailCode.generateLetter(mailInfo.getClient()))
                                .put(Emailv31.Message.CUSTOMID, "ClientGreetings")));

        response = client.post(request);

        System.out.println("Mailjet Status: " + response.getStatus());
        System.out.println("Mailjet Data: " + response.getData());
    }
}
