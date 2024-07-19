package io.spring.gungnir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import io.spring.gungnir.service.UserService;

@Controller // controller class宣言
public class UserController {
	@Autowired // サービスクラスを自動でnewしてくれるアノテーション
	UserService userService;
	/*
	 * URL（localhost:8080/user）でアクセスでトップ画面の表示top.html
	 * ★404エラー解決：@SpringBootApplicatioを、io.spring.gungnirの直下に移動
	 */

	@GetMapping(value = "/user") // このURLにマッピングされておりGetするとメソッドが動く
	//コントローラーで「/user」が指定されたときは、「top」を返すという指定がされているので、最初に表示される画面は「top.html」になりますね。
	public String display() {
		return "top"; // top.htmlの画面を表示
	}
}
