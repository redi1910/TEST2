package com.msc.B2Cconfig.service.impl.common;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        //TODO: return type will be updated.
        //when we implement spring security we should get current user from the app.
        //We can check and decide how we want to get current user. From SecurityContextHolder and get current user,
        // or from msc-auth we can retrieve current user.
        return Optional.of("MSC app super user");
    }
}
