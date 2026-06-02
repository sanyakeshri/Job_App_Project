//package com.telusko.JobApp;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//@Controller
//public class JobController {
//
//    @RequestMapping({"/" , "home"})
//    public String home(){
//
//        return "home";
//    }
//
//    @RequestMapping("addJob")
//    public String addJob(){
//        return "addjob";
//    }
//
//    @PostMapping("handleForm")
//    @ResponseBody
//    public String handleForm(
//            @RequestParam(required = false) String postId
//    ){
//        return "WORKING";
//    }
//}

package com.telusko.JobApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class JobController {

    @RequestMapping({"/","/home"})
    public String home() {
        return "home";
    }

    @RequestMapping("/addJob")
    public String addjob() {
        return "addjob";
    }

    @PostMapping("/handleForm")
    @ResponseBody
    public String handleForm(
            @RequestParam(required = false) String postId
    ) {
        return "WORKING";
    }
}
