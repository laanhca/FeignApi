//package com.av.api;
//
//import feign.Feign;
//import feign.Param;
//import feign.RequestLine;
//import feign.gson.GsonDecoder;
//
//import java.util.List;
//
//interface GitHub {
//
//    @RequestLine("GET /repos/{owner}/{repo}/contributors")
//    List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repository);
//
//    class Contributor {
//        String login;
//        int contributions;
//    }
//}
//
//public class MyApp {
//    public static void main(String[] args) {
//        GitHub github = Feign.builder()
//                .decoder(new GsonDecoder())
//                .target(GitHub.class, "https://api.github.com");
//
//        /* The owner and repository parameters will be used to expand the owner and repo expressions
//         * defined in the RequestLine.
//         *
//         * the resulting uri will be https://api.github.com/repos/OpenFeign/feign/contributors
//         */
//        github.contributors("OpenFeign", "feign");
//        System.out.println(github.contributors("OpenFeign", "feign").toString());
//    }
//}