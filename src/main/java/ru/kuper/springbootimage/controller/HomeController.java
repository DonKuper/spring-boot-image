package ru.kuper.springbootimage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kuper.springbootimage.model.ImageObj;
import ru.kuper.springbootimage.repo.ImageRepository;
import ru.kuper.springbootimage.util.UtilClass;

import java.io.IOException;

@Controller
@RequestMapping("/")
public class HomeController {


    private ImageRepository imageRepository;

    private UtilClass utilClass;

    @Autowired
    public HomeController(ImageRepository imageRepository, UtilClass utilClass) {
        this.imageRepository = imageRepository;
        this.utilClass = utilClass;
    }

    @GetMapping
    public String getIndex(Model model) throws IOException {
        ImageObj imageObj = new ImageObj("im1", utilClass.getImageBytes("imgs/i.jpg"));
        imageRepository.save(imageObj);
        return "index";
    }

//    @PostMapping
//    public Model showImage() {
//        model
//    }

}
