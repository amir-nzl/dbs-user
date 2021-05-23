package org.example;

import io.ebean.DB;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Consumes;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.multipart.CompletedFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

@Controller("/v1/customer")
public class CustomerController {

  private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

  /**
   * Upload a list of transactions from a CSV file.
   *
   * @param file an exported and uploaded CSV ile containing transactions
   * @return the list of transactions in JSON format
   */
  @Post(produces = {"application/json"})
  HttpResponse<Customer> create(@Body Customer customer){
    //customer.save();
    return HttpResponse.ok(customer);
  }

}
