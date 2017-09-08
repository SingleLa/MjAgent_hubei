package com.rafo.mjagent.controller;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/8.
 */
@Controller
public class testController {

    @RequestMapping("/test.do")
    public String test(Model model){
        Map m = new HashedMap();
        m.put("test","asdasd");
        model.addAttribute("m",m);
      return "index";
    }
}
