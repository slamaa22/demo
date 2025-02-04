package at.htlkaindorf.quiz;

import com.example.exa_107_quiz.Category;
import com.example.exa_107_quiz.QuizQuestion;

import java.util.*;

public class QuestionPool {

    Map<Category, List<QuizQuestion>> pool = new HashMap<>();

    public QuestionPool() {
        populate();
    }

    private void populate() {
        // Sample questions for each category
        pool.put(Category.TENNIS, Arrays.asList(
                new QuizQuestion("Who has won the most Grand Slam titles in tennis?",
                        Arrays.asList("Roger Federer", "Rafael Nadal", "Novak Djokovic", "Pete Sampras"), 3),
                new QuizQuestion("What is the surface of the Wimbledon court?",
                        Arrays.asList("Clay", "Grass", "Hard", "Carpet"), 2),
                new QuizQuestion("Which country has won the most Davis Cup titles?",
                        Arrays.asList("USA", "Australia", "France", "Spain"), 1),
                new QuizQuestion("Who is known as the 'King of Clay'?",
                        Arrays.asList("Novak Djokovic", "Roger Federer", "Rafael Nadal", "Andy Murray"), 3),
                new QuizQuestion("What is the maximum score in a single tennis game?",
                        Arrays.asList("40", "50", "60", "70"), 1)
        ));

        pool.put(Category.VEGETABLE, Arrays.asList(
                new QuizQuestion("Which vegetable is known as the king of vegetables?",
                        Arrays.asList("Tomato", "Brinjal", "Carrot", "Potato"), 2),
                new QuizQuestion("What vegetable is the main ingredient in guacamole?",
                        Arrays.asList("Avocado", "Tomato", "Onion", "Cucumber"), 1),
                new QuizQuestion("Which vegetable is the largest by weight?",
                        Arrays.asList("Pumpkin", "Watermelon", "Cucumber", "Zucchini"), 1),
                new QuizQuestion("What vegetable is often referred to as 'baby corn'?",
                        Arrays.asList("Mini corn", "Sweet corn", "Baby corn", "Young corn"), 3),
                new QuizQuestion("What vegetable is known as a 'courgette' in the UK?",
                        Arrays.asList("Zucchini", "Eggplant", "Cucumber", "Radish"), 1)
        ));

        pool.put(Category.HISTORY, Arrays.asList(
                new QuizQuestion("Who was the first President of the United States?",
                        Arrays.asList("George Washington", "John Adams", "Thomas Jefferson", "James Madison"), 1),
                new QuizQuestion("What year did World War II end?",
                        Arrays.asList("1943", "1945", "1947", "1950"), 2),
                new QuizQuestion("Who discovered America?",
                        Arrays.asList("Christopher Columbus", "Ferdinand Magellan", "Marco Polo", "Vasco da Gama"), 1),
                new QuizQuestion("What year was the Declaration of Independence signed?",
                        Arrays.asList("1776", "1778", "1781", "1783"), 1),
                new QuizQuestion("Who was the first emperor of Rome?",
                        Arrays.asList("Julius Caesar", "Augustus", "Nero", "Caligula"), 2)
        ));

        pool.put(Category.FORTNITE, Arrays.asList(
                new QuizQuestion("What year was Fortnite released?",
                        Arrays.asList("2015", "2016", "2017", "2018"), 3),
                new QuizQuestion("What is the main currency in Fortnite?",
                        Arrays.asList("Gold", "Silver", "V-Bucks", "Coins"), 3),
                new QuizQuestion("What mode is Fortnite most famous for?",
                        Arrays.asList("Battle Royale", "Save the World", "Creative", "Arena"), 1),
                new QuizQuestion("What is the maximum number of players in a Fortnite match?",
                        Arrays.asList("50", "75", "100", "150"), 3),
                new QuizQuestion("Which company developed Fortnite?",
                        Arrays.asList("Epic Games", "Valve", "EA Sports", "Activision"), 1)
        ));

        pool.put(Category.ART, Arrays.asList(
                new QuizQuestion("Who painted the Mona Lisa?",
                        Arrays.asList("Vincent Van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"), 3),
                new QuizQuestion("What is the art of paper folding called?",
                        Arrays.asList("Origami", "Kirigami", "Papercraft", "Scrapbooking"), 1),
                new QuizQuestion("What is the term for three-dimensional artwork?",
                        Arrays.asList("Sculpture", "Painting", "Drawing", "Carving"), 1),
                new QuizQuestion("Who is known as the 'Father of Modern Art'?",
                        Arrays.asList("Pablo Picasso", "Claude Monet", "Paul Cézanne", "Andy Warhol"), 3),
                new QuizQuestion("What movement is Salvador Dalí associated with?",
                        Arrays.asList("Cubism", "Surrealism", "Impressionism", "Futurism"), 2)
        ));

        pool.put(Category.CULTURE, Arrays.asList(
                new QuizQuestion("What is the most widely spoken language in the world?",
                        Arrays.asList("English", "Mandarin Chinese", "Spanish", "Hindi"), 2),
                new QuizQuestion("What is the traditional Japanese garment called?",
                        Arrays.asList("Hanbok", "Kimono", "Sari", "Ao Dai"), 2),
                new QuizQuestion("Which country is famous for its maple syrup?",
                        Arrays.asList("USA", "Canada", "Switzerland", "Norway"), 2),
                new QuizQuestion("What is the primary religion in India?",
                        Arrays.asList("Buddhism", "Christianity", "Hinduism", "Islam"), 3),
                new QuizQuestion("What does UNESCO stand for?",
                        Arrays.asList("United Nations Educational, Scientific, and Cultural Organization",
                                "Universal Network for Education, Science, and Culture",
                                "United Nations Economic, Social, and Cultural Office",
                                "Universal Network for Economic, Social, and Cultural Opportunities"), 1)
        ));
    }

    public List<QuizQuestion> getQuestionSet(Category category) {
        return pool.get(category);
    }
}