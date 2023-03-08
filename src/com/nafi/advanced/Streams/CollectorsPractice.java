package com.nafi.advanced.Streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectorsPractice {

    public void main(String[] args) {
        List<Integer> list = List.of(1,23,4,5);
        Predicate<Integer> element = (a) -> a > 4;
        System.out.println(list.stream().filter(element).count());;
        list.forEach(System.out::println);
        List<Integer> newIntegers = list.stream().filter(element).collect(java.util.stream.Collectors.toList());

        var sum = list.stream().collect(Collectors.summingInt(elements -> elements));
        System.out.println(sum);

        IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(elements -> elements)); // Very useful in real world applications
        System.out.println(stats);


        var movies = List.of(
                new Movie("a", 200),
                new Movie("c", 3000)
        );


//        var result =
//                movies.
//                stream().
//                        collect(Collectors.partitioningBy(movie -> movie.ticketPrice > 100), Collectors.mapping(Movie::getTicketPrice, Collectors.joining(",")));
    }

    public class Movie {

        public String movieName;

        public Integer getTicketPrice() {
            return ticketPrice;
        }

        public void setTicketPrice(Integer ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        public Integer ticketPrice;

        public Movie(String movieName, Integer ticketPrice) {
            this.movieName = movieName;
            this.ticketPrice = ticketPrice;
        }

        public String getMovieName() {
            return movieName;
        }

        public void setMovieName(String movieName) {
            this.movieName = movieName;
        }
    }
}
