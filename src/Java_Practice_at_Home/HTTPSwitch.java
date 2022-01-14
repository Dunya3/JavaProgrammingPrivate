package Java_Practice_at_Home;

public class HTTPSwitch {
    public static void main(String[] args) {

     int statusCode = 200;
     String results ="";

     switch (statusCode){
         case 200 :
             results = "OK";
             break;
         case 201:
             results = "Created";
         break;
         case 202:
             results = "Accepted";
             break;
         case 301:
             results = "Moved Permanently";
             break;
         case 303:
             results = "See Other";
             break;
         case 304 :
             results = "Not Modified";
             break;
         case 307:
             results = "Temporary Redirect";
             break;
         case 400:
             results = "Bad Request";
             break;
         case 401:
             results = "Unauthorized";
             break;
         case 403:
             results = "Forbidden";
             break;
         case 404:
             results = "Not Found";
             break;
         case 410:
             results = "Gone";
             break;
         case 500:
             results = "Internal Server Error";
             break;
         case 503:
             results = "Service Unavailable";

         default:
             results = "Invalid";

     }
        System.out.println(results);







    }
}
/*
5.HTTP is the protocol that governs communications between web-servers and web clients.
Part of the protocol includes a status code returned by the
server to tell the browser the status of its most recent page request.
Some off the codes and their meanings are listed below:

            status code:
                200, OK
                201, Created
                202, Accepted
                301, Moved Permanently
                303, See Other
                304, Not Modified
                307, Temporary Redirect
                400, Bad Request
                401, Unauthorized
                403, Forbidden
                404, Not Found
                410, Gone
                500, Internal Server Error
                503, Service Unavailable


         declare an int variable called StatusCode, write a switch that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

 */