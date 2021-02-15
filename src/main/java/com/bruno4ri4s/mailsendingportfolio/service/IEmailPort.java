package com.bruno4ri4s.mailsendingportfolio.service;

import com.bruno4ri4s.mailsendingportfolio.dto.EmailBody;

public interface IEmailPort {

    public boolean sendEmail(EmailBody emailBody);
}
