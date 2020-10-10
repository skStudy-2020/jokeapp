package guru.springframework.jokeapp.controller;

import guru.springframework.jokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        //model is an interface which fetches results/query from HttpServlet
        //joke attribute will be used to fetch value from controler and used in html file with thymeleaf var
        //myjoke is tha name of html file and should br present in template folder

        model.addAttribute("joke", jokeService.getJoke());

        return "myjoke";
    }
}
