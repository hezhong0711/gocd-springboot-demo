package demo.springboot.gocd.lottery.ticket.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HelloController {

    @GetMapping()
    public String getDoubleColorBallResult() {
        return "hello";
    }
}
