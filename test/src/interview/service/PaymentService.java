package interview.service;

import interview.model.Payment;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PaymentService {
    public static void main(String[] args) {
        List<Payment> employments = List.of(new Payment(1,20000,"gpay"),
        new Payment(3,22000,"apay"),
        new Payment(2,25000,"gpay"),
        new Payment(7,26000,"ppay"),
        new Payment(4,22000,"apay"),
        new Payment(5,25000,"paytm"));

        List<String> type = getUniqueType(employments);

        System.out.println(type);

        Payment rankedpayment = rankedpayment(employments,2);

        System.out.println(rankedpayment);

        List<Payment> rankedpaymentlist = rankedPayments(employments,3);
        System.out.println(rankedpaymentlist);



    }

    private static List<Payment> rankedPayments(List<Payment> empPayments, int i) {
        long ithHighestSalary = empPayments.stream().map(Payment::getAmount).distinct().sorted(Comparator.reverseOrder()).skip(i-1).findFirst().orElse(0L);
        System.out.println("Ith highest amount : "+ithHighestSalary);
        return empPayments.stream().filter(payment -> payment.getAmount()==ithHighestSalary).toList();
    }

    private static Payment rankedpayment(List<Payment> empPayments, int i) {
        return empPayments.stream().sorted(Comparator.comparing(Payment::getAmount,Comparator.reverseOrder()))
                .skip(i-1).findFirst()
                .orElseThrow(()->new RuntimeException("Not found"));
    }

    private static List<String> getUniqueType(List<Payment> empPayments) {
               return empPayments.stream().map(Payment::getType).distinct().collect(Collectors.toList());

    }
}
