package com.organic;


import com.organic.dao.SystemRepository;
import com.organic.model.SystemExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "system")
public class SystemController {

    @Autowired
    private SystemRepository systemRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody String addNewSystem(@RequestParam String name, @RequestParam String lastaudit){
        SystemExample n = new SystemExample();
        n.setName(name);
        n.setLastaudit(lastaudit);
        systemRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<SystemExample> getAllSystem() {
        return systemRepository.findAll();
    }

}
