package book.store.add;

import com.intuit.karate.junit5.Karate;

public class BookStoreAddTest {

	@Karate.Test
    Karate testQuotes() {
        return Karate.run("bookstoreadd.feature").relativeTo(getClass());
    }
}
