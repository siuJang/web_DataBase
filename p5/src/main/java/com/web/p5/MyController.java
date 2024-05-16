package com.web.p5;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MyController {
 @Autowired
 private memberRep mrep;
 @GetMapping("/member/list")
 public String memberList(Model mo) {
 List<member> arr = mrep.findAll(); 
 mo.addAttribute("arr",arr);
 return "memberList";
 }
 
 @Autowired
 private productRep prep;
 @GetMapping("/product/list")
 public String productList(Model mo) {
 List<product> arr = prep.findAll(); 
 mo.addAttribute("arr",arr);
 return "productList";
 }
} // class