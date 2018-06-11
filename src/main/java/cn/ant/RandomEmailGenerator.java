package cn.ant;

import org.springframework.stereotype.Service;

@Service
public class RandomEmailGenerator implements EmailGenerator {

	public String generate() {
		return "cdd@163.com";
	}

}
