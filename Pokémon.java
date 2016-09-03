import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Pokémon {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		Set<String> type=new HashSet<String>();
		Set<String> stab=new HashSet<String>();
		Set<String> typelist=new HashSet<String>();
		Set<String> nostab=new HashSet<String>();
		String Normal="Normal";
		String Grass="Grass";
		String Fire="Fire";
		String Water="Water";
		String Fighting="Fighting";
		String Flying="Flying";
		String Poison="Poison";
		String Ground="Ground";
		String Rock="Rock";
		String Bug="Bug";
		String Ghost="Ghost";
		String Electric="Electric";
		String Psychic="Psychic";
		String Ice="Ice";
		String Dragon="Dragon";
		String Dark="Dark";
		String Steel="Steel";
		String Fairy="Fairy";
		typelist.add(Normal);
		typelist.add(Grass);
		typelist.add(Fire);
		typelist.add(Water);
		typelist.add(Fighting);
		typelist.add(Flying);
		typelist.add(Poison);
		typelist.add(Ground);
		typelist.add(Rock);
		typelist.add(Bug);
		typelist.add(Ghost);
		typelist.add(Electric);
		typelist.add(Psychic);
		typelist.add(Ice);
		typelist.add(Dragon);
		typelist.add(Dark);
		typelist.add(Steel);
		typelist.add(Fairy);
		System.out.println("Enter 12 types");
		String type1=in.nextLine();
		String type2=in.nextLine();
		String type3=in.nextLine();
		String type4=in.nextLine();
		String type5=in.nextLine();
		String type6=in.nextLine();
		String type7=in.nextLine();
		String type8=in.nextLine();
		String type9=in.nextLine();
		String type10=in.nextLine();
		String type11=in.nextLine();
		String type12=in.nextLine();
		type.add(type1);
		type.add(type2);
		type.add(type3);
		type.add(type4);
		type.add(type5);
		type.add(type6);
		type.add(type7);
		type.add(type8);
		type.add(type9);
		type.add(type10);
		type.add(type11);
		type.add(type12);
		if (type.contains(Fighting)){
			stab.add(Normal);
		}
		if (type.contains(Fire)||type.contains(Flying)||type.contains(Poison)||type.contains(Bug)||type.contains(Ice)){
			stab.add(Grass);
		}
		if (type.contains(Water)||type.contains(Ground)||type.contains(Rock)){
			stab.add(Fire);
		}
		if (type.contains(Grass)||type.contains(Electric)){
			stab.add(Water);
		}
		if (type.contains(Flying)||type.contains(Psychic)||type.contains(Fairy)){
			stab.add(Fighting);
		}
		if (type.contains(Rock)||type.contains(Electric)||type.contains(Ice)){
			stab.add(Flying);
		}
		if (type.contains(Ground)||type.contains(Psychic)){
			stab.add(Poison);
		}
		if (type.contains(Grass)||type.contains(Water)||type.contains(Ice)){
			stab.add(Ground);
		}
		if (type.contains(Grass)||type.contains(Water)||type.contains(Fighting)||type.contains(Ground)||type.contains(Steel)){
			stab.add(Rock);
		}
		if (type.contains(Fire)||type.contains(Flying)||type.contains(Rock)){
			stab.add(Bug);
		}
		if (type.contains(Ghost)||type.contains(Dark)){
			stab.add(Ghost);
		}
		if (type.contains(Ground)){
			stab.add(Electric);
		}
		if (type.contains(Bug)||type.contains(Ghost)||type.contains(Dark)){
			stab.add(Psychic);
		}
		if (type.contains(Fire)||type.contains(Fighting)||type.contains(Rock)||type.contains(Steel)){
			stab.add(Ice);
		}
		if (type.contains(Ice)||type.contains(Fairy)){
			stab.add(Dragon);
		}
		if (type.contains(Fighting)||type.contains(Bug)||type.contains(Fairy)){
			stab.add(Dark);
		}
		if (type.contains(Fire)||type.contains(Fighting)||type.contains(Ground)){
			stab.add(Steel);
		}
		if (type.contains(Poison)||type.contains(Steel)){
			stab.add(Fairy);
		}
		System.out.println("Your team has STAB moves against the following types:\n"+stab+"\n");
		nostab.addAll(typelist);
		nostab.removeAll(stab);
		System.out.print("Your team lacks STAB moves against the following types:\n"+nostab);
		in.close();
	}

}
