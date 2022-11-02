package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FoodOutlet {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException{
        List<String> seattle = FoodOutlet.getRelevantFoodOutlet("Seattle",140);
        System.out.println(seattle);
    }
    public static List<String> getRelevantFoodOutlet(String city, int maxCost) throws IOException, URISyntaxException, InterruptedIOException{
        List<String> res = new ArrayList<>();
        String base_url ="https://jsonmock.hackerrank.com/api/food_outlets?city=" + city;
        String url_address = base_url+"&page=1";
        String resBody = callURL(url_address);
        List<String> strings = processData(resBody,maxCost);
        res.addAll(strings);

        Foodoutlet foodoutlet = objectMapper.readValue(resBody, Foodoutlet.class);
        String s = objectMapper.writeValueAsString(foodoutlet);
        System.out.println(s);
        int total_pages = foodoutlet.getTotal_page();

        for(int i=2;i<=total_pages;i++){
            url_address=base_url+"&page="+i;
            resBody=callURL(url_address);
            strings=processData(resBody,maxCost);
            res.addAll(strings);
        }
        return res;
    }
    private static String callURL(String url_address) throws IOException {
        URL url = new URL(url_address);
        HttpURLConnection con =(HttpURLConnection) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String line = br.readLine();
        return line;
    }
    private static List<String> processData(String resBody, int maxCost) throws JsonProcessingException {
        Foodoutlet foodoutlet = objectMapper.readValue(resBody, Foodoutlet.class);
        List<Data> datas = foodoutlet.getData();
        List<String> collect = datas.stream()
                .filter(data -> data.getEstimated_cost()<=maxCost)
                .map(data ->data.getName()).collect(Collectors.toList());
        return collect;
    }

    static class Foodoutlet{
        @JsonProperty("page")
        int page;
        @JsonProperty("per_page")
        int per_page;
        @JsonProperty("total")
        int total;
        @JsonProperty("total_pages")
        int total_page;
        @JsonProperty("data")
        List<Data> data;

        public int getTotal_page() {
            return total_page;
        }

        public List<Data> getData() {
            return data;
        }
    }
    static class Data{
        @JsonProperty("city")
        String city;
        @JsonProperty("name")
        String name;
        @JsonProperty("estimated_cost")
        int estimated_cost;
        @JsonProperty("user_rating")
        UserRating uer_rating;
        @JsonProperty("id")
        int id;
        public String getName(){
            return name;
        }

        public int getEstimated_cost() {
            return estimated_cost;
        }
    }
    static class UserRating{
        @JsonProperty("average_rating")
        float average_rating;

        @JsonProperty("votes")
        int votes;
    }
}
