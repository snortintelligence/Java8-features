package flatmap.stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Teams {
	public static void main(String[] args) {

		List<String> teamA = Arrays.asList("MS Dhoni", "Scott", "Methew", "John Smith");
		List<String> teamB = Arrays.asList("Md Kaif", "Williams", "Broker", "Smith");
		List<String> teamC = Arrays.asList("Rohit Sharma", "Balaji", "VVS Laxman", "Sachin");

		List<List<String>> worldCupTeams = Arrays.asList(teamA, teamB, teamC);
		// Without Java 8
		System.out.println("Lising temas...");
		for (List<String> teams : worldCupTeams) {
			for (String team : teams) {
				System.out.print(team + ", ");
			}
			System.out.println();
		}
		// With Java 8 using flatMap(func)
		// Function<List<String>, String>
		List<String> ateam  = worldCupTeams.stream().flatMap(xTeam -> xTeam.stream()).map(player -> player.toUpperCase())
				.collect(Collectors.toList());
		
		//find name length of each player
		List<Integer> teamNameLen  = worldCupTeams.stream().flatMap(xTeam -> xTeam.stream()).map(player -> player.length())
				.collect(Collectors.toList());

		System.out.println(ateam);
		System.out.println(teamNameLen);
		
		
	}
}
