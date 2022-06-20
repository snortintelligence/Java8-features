package com.snort.intelli.defaults.statics;

import java.util.Arrays;
import java.util.Random;

@FunctionalInterface
public interface MessageSender {

	default String genrateOtp() {
		// a method with default implementation
		String range = "1234567890";
		Random random = new Random();
		char[] otp = new char[4];
		for (int i = 0; i < otp.length; i++) {
			int n = random.nextInt(range.length());
			otp[i] = range.charAt(n);
		}
		return sendOtpAsString(otp);
	}

	static String sendOtpAsString(char[] data) {
		// utility method
		return Arrays.toString(data);
	}

	public abstract String yourMessage(String msg);

}
