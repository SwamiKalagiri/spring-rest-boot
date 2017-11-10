package com.srk.service;

import com.srk.bean.ContentBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class ContentRestController {
    private static final String template = "Welcome to %s!!! Local is %s";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/getContent")
    public ContentBean getContent(
            @RequestParam(value = "name", defaultValue = "Rest World") String name,
            Locale locale
    ) {
        return new ContentBean(counter.incrementAndGet(),
                String.format(template, name, locale));
    }
}
