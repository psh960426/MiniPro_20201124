package kr.co.softsoldesk.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.softsoldesk.beans.DataBean;

@RestController //@Controller 처럼 주소로 넘기지 않고 데이터 값으로 넘긴다 ex) test2.jsp가 없어도 값이 넘어감
				//브라우저로 페이지 소스보기 하면 controller는 일반 html소스가 다 노출. rest는 데이터 값만 노출
public class RestTestController {
	
	@GetMapping("/test2")
	public ResponseEntity<ArrayList<DataBean>> test1() {
		DataBean bean1 = new DataBean("문자열1",100,11.11,false);
		DataBean bean2 = new DataBean("문자열2",200,22.22,false);
		DataBean bean3 = new DataBean("문자열3",300,33.33,false);
		
		ArrayList<DataBean> list = new ArrayList<DataBean>();
		list.add(bean1);
		list.add(bean2);
		list.add(bean3);
		
		//JSON으로 변환
		ResponseEntity<ArrayList<DataBean>> entry = new ResponseEntity<ArrayList<DataBean>>(list, HttpStatus.OK);
		
		return entry;
	}

}
