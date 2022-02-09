package uni.fmi.project.register.model;

import java.util.Collections;
import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import uni.fmi.models.Farm;

public class RegisterService {

	private static List<Farm> farmdb = Collections.singletonList(new Farm("Farm Detelini", "Mariq Dimitrova"));

	public static Object register(final String name, final String owner) {
		farmdb.stream().anyMatch(f -> name.equals(f.getName()) && owner.equals(f.getOwner()));

		final boolean isEverythingMatch = farmdb.stream()
				.anyMatch(u -> u.getName().equals(name) && u.getOwner().equals(owner));
		final boolean isFarmnameMatch = farmdb.stream().anyMatch(u -> u.getName().equals(name));

		if (!isEverythingMatch && !(name == "") && !(owner == "")) {
			return "Registered";
		} else if (isEverythingMatch) {
			return "Registration is already available";
		}

		if (name == "") {
			return "Please enter a name";
		} else {
			return "Please enter a owner name";
		}

	}

}
