package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.NestedServletException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


@RestController
@RequestMapping("upload")
@CrossOrigin
public class fileUploadController {


    @PostMapping
    public String handleFileUpload(@RequestParam("files") MultipartFile[] files) throws NumberFormatException, NestedServletException {

//        for (int i = 0; i < files.length; i++) {
//            MultipartFile file = files[i];
//            try {
//                byte[] bytes = file.getBytes();
//                Path path = Paths.get(file.getOriginalFilename());
//                Files.write(path, bytes);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        return "success";
    }
}
