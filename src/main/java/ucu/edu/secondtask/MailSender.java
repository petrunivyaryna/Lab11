package ucu.edu.secondtask;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public interface MailSender {
    void sendMail(MailInfo mailInfo)
            throws MailjetException, MailjetSocketTimeoutException;
}