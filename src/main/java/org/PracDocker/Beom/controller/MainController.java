package org.PracDocker.Beom.controller;

import lombok.RequiredArgsConstructor;
import org.PracDocker.Beom.config.S3Uploader;
import org.PracDocker.Beom.dto.MainRequestDTO;
import org.PracDocker.Beom.entity.MainEntity;
import org.PracDocker.Beom.service.MainService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class MainController {

    private final MainService mainService;
    private final S3Uploader s3Uploader;


    @GetMapping("/")
    public String home() {
        return "helkdsah";
    }

    @PostMapping("/save")
    public String saveTest(@RequestBody MainRequestDTO mainRequestDTO) {
        mainService.save(mainRequestDTO);
        return "Save "+mainRequestDTO.getName();
    }

    @GetMapping("/get/{id}")
    public String getTest(@PathVariable Long id){
        return mainService.getName(id);
    }

//    @PostMapping("/uploadimg")
//    public BaseResponse<> create(
//            @RequestPart(value = "postBoardReq") MultipartFile Req,
//            @RequestPart(value = "boardImg", required = false) MultipartFile multipartFile){
//
//        String fileName = "";
//        if(multipartFile != null){ // 파일 업로드한 경우에만
//
//            try{// 파일 업로드
//                fileName = s3Uploader.upload(multipartFile, "images"); // S3 버킷의 images 디렉토리 안에 저장됨
//                System.out.println("fileName = " + fileName);
//            }catch (IOException e){
//                return new BaseResponse<>(FAIL_FILE_CHANGE);
//            }
//        }


}
