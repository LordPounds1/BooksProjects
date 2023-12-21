package es.usj.booksprojects.mapper;

import android.util.Log;

import es.usj.booksprojects.model.Author;
import es.usj.booksprojects.serverOperations.valueApi.AuthorValueApi;


public class AuthorMapper {
    public static Author toDomainAuthor(AuthorValueApi valueApi){
        Author author = new Author();
        author.setName(valueApi.getName());
        author.setBiographie(valueApi.getBio());
        author.setWikipedia(valueApi.getWikipedia());
        author.setWebsite(valueApi.getWebsite());
        author.setBirthDate(valueApi.getBirth_date());
        Log.e("mapper",valueApi.toString());
        //...
        return author;
    }
}
