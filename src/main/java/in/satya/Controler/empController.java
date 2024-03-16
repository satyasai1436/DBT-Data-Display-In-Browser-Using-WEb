package in.satya.Controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import in.satya.Entity.empData;
import in.satya.Service.empService;

@Controller
public class empController {

    @Autowired
    private empService service;

    @GetMapping("/data")
    public ModelAndView getAll() {
        ModelAndView mv = new ModelAndView();
        List<empData> empList = service.get();
        mv.addObject("data", empList);
        mv.setViewName("index"); 
        return mv;
    }
}
