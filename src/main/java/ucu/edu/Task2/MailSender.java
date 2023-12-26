package ucu.edu.task2;

import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.errors.MailjetSocketTimeoutException;

public interface MailSender {
    void sendMail(MailInfo mailInfo)
            throws MailjetException, MailjetSocketTimeoutException;
}