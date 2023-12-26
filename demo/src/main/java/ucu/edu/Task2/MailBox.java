package ucu.edu.Task2;

import java.util.ArrayList;
import java.util.List;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public class MailBox {
    private List<MailInfo> infos;

    public MailBox() {
        this.infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll(MailSender mailSender) throws MailjetException, MailjetSocketTimeoutException {
        for (MailInfo mailInfo : infos) {
            mailSender.sendMail(mailInfo);
        }
    }
}
