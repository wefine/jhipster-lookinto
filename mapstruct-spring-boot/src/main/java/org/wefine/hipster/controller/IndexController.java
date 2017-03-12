package org.wefine.hipster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping(path = {"/", "index", "index.html"})
    public String index() {
        return "index";
    }
}
