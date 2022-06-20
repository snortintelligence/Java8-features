package com.snort.intelli.lambdas;

import com.snort.intelli.defaults.statics.MessageSender;

public class MessageSenderMain {
	public static void main(String[] args) {
		
		MessageSender sender = (String msg)->{
			return msg;
		};
		System.out.println(sender.genrateOtp());
	}
}
