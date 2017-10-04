package pl.cbl.tests;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdy {

	public static void main(String[] args) {

		Function<String, String> function = (String str) -> str.toUpperCase().trim();

		String word = "  at all cost you have to write a code    ";

		String changedWord = function.apply(word);

		System.out.println(word);
		System.out.println(changedWord);

		Consumer<Object> show = x -> System.out.println(x);
		Consumer<Object> show2 = System.out::println;

		show2.accept(word);
		show2.accept(word);

		List<Book> lista = new ArrayList<>();
		lista.add(new Book("czerwony kapture", "konpnicka", "puszczalska pani"));
		lista.add(new Book("burka", "zareba", "czubki"));
		lista.add(new Book("warka", "arafat", "hrhrhrh"));
		lista.add(new Book("maraton", "biegacz", "book aobut running"));
		System.out.println("-----------");
		iterateList(lista, book -> System.out.println(book));
		changeInList(lista, book -> {
			book.setTitle(book.getTitle() + " book");
			return book;
		});
		System.out.println("-----------");
		iterateList(lista, book -> System.out.println(book));
		System.out.println("-----------");
		showByWord(lista, book -> book.getAuthor().contains("zareba"));

	}

	private static <A> void iterateList(List<A> lista, Consumer<A> cons) {
		for (A book : lista) {
			cons.accept(book);
		}
	}

	private static <B> void changeInList(List<B> list, Function<B, B> function) {
		for (int i = 0; i < list.size(); i++) {
			list.set(i, function.apply(list.get(i)));
		}
	}

	private static <C> void showByWord(List<C> list, Predicate<C> pred) {
		for (C book : list) {
			if (pred.test(book)) {
				System.out.println(book);
				;
			}
		}

	}

}
