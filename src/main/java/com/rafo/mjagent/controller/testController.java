package com.rafo.mjagent.controller;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Administrator on 2017/9/8.
 */
@Controller
public class testController {

    @RequestMapping("/test.do")
    public String test(Model model){
        Map m = new HashedMap();
        m.put("test","你好");
        model.addAttribute("m",m);
      return "index.jsp";
    }
}
