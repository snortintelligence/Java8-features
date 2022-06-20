package com.snort.intelli.defaults.statics;

public class Applications {
	public static void main(String[] args) {
		MessageSender sender = new MessageSender() {
			@Override
			public String yourMessage(String msg) {
				return msg+" : "+genrateOtp();
			}
		};

		String msg = sender.yourMessage("Please don't share otp valid upto 10 sec");
		System.out.println(msg);
	}
}
