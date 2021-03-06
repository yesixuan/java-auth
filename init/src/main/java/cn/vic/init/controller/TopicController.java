package cn.vic.init.controller;

import cn.vic.init.service.TopicService;
import cn.vic.init.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tomoya at 2018/8/10
 */
@RestController
@RequestMapping("/topic")
public class TopicController {

  @Autowired
  private TopicService topicService;

  @GetMapping("/list")
  public Result list(@RequestParam(defaultValue = "1") Integer pageNo) {
    return Result.success(topicService.findAll(pageNo, 20));
  }
}
