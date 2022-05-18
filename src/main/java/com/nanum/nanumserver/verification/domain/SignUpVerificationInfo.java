package com.nanum.nanumserver.verification.domain;

import java.time.LocalDateTime;

public class SignUpVerificationInfo extends VerificationInfo {

    public SignUpVerificationInfo() {
    }

    public SignUpVerificationInfo(String username, String verificationCode) {
        super(username, verificationCode);
    }

    public SignUpVerificationInfo(Long id, String username, String verificationCode, LocalDateTime createdAt, LocalDateTime confirmedAt) {
        super(id, username, verificationCode, createdAt, confirmedAt);
    }
}
