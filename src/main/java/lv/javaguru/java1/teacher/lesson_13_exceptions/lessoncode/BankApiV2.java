package lv.javaguru.java1.teacher.lesson_13_exceptions.lessoncode;

import java.util.Optional;

public class BankApiV2 {

	public Optional<String> getClientFullName(String securityKey, Long clientId)
			throws AccessDeniedException {
		if (securityKey == null || !securityKey.equals("abcd")) {
			AccessDeniedException exception = new AccessDeniedException("Invalid sequrity key", securityKey);
			throw exception;
			// throw new AccessDeniedException("Invalid sequrity key", sequrityKey);
		}
		if (clientId == 1L) {
			return Optional.of("Petja");
		} else {
			return Optional.empty();  // return "";
		}
	}

	public static void main(String[] args) throws AccessDeniedException {
		try {
			BankApiV2 bankApi = new BankApiV2();
			Optional<String> result = bankApi.getClientFullName("sds", 1L);
			if (result.isEmpty()) {
				System.out.println("Client not found");
			} else {
				System.out.println("Client full name " + result.get());
			}
		}  finally {
			System.out.println("Finally");
		}
	}

}
