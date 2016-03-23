package co.edu.uniandes.arquiagil.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MailUtil {

	private static final Logger log = LoggerFactory.getLogger(MailUtil.class);

	public static void enviarEmail(String asunto, String mensaje){
		try{
			// Recipient's email ID needs to be mentioned.
			String to = "jc.nino11@uniandes.edu.co";

			// Sender's email ID needs to be mentioned
			String from = "zioks666@gmail.com";

			// Assuming you are sending email from localhost
			String host = "smtp.gmail.com";

			// Get system properties
			Properties properties = System.getProperties();

			// Setup mail server
			properties.setProperty("mail.smtp.host", host);

			// Get the default Session object.
			Session session = Session.getDefaultInstance(properties);

			try{
				// Create a default MimeMessage object.
				MimeMessage message = new MimeMessage(session);

				// Set From: header field of the header.
				message.setFrom(new InternetAddress(from));

				// Set To: header field of the header.
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

				// Set Subject: header field
				message.setSubject(asunto);

				// Now set the actual message
				message.setText(mensaje);

				// Send message
				Transport.send(message);
				System.out.println("Sent message successfully....");
			}catch (MessagingException mex) {
				mex.printStackTrace();
			}
		}finally{
			log.info(""+CronometroUtil.parcial());
			CronometroUtil.inicial = new Date();
		}
	}

}
