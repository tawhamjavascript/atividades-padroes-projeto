import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kiosk contexto = new Kiosk();

        while (true) {
            if (!contexto.hasAvailableCourse()) {
                System.out.println("Não há mais cursos disponíveis");
                break;
            }
            if (contexto.getState() instanceof OnHold) {
                System.out.print("Digite a matrícula do aluno: ");
                String matricula = sc.nextLine();
                try {
                    boolean valid = contexto.validateRegistration(matricula);
                    if (valid) {
                        System.out.println("Matrícula válida");
                    }

                    else {
                        System.out.println("Matrícula inválida");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            else if (contexto.getState() instanceof Identified) {
                System.out.println("Cursos disponíveis");
                System.out.println("1 - GPT");
                System.out.println("2 - BLOCKCHAIN");
                System.out.println("3 - IOT");
                System.out.println("4 - VR");

                System.out.print("Escolha o curso: ");
                int curso = sc.nextInt();
                try {
                    if (curso > 4) {
                        System.out.println("Curso inválido");
                    }
                    else {
                        boolean valid = false;
                        switch (curso) {
                            case 1:
                                valid = contexto.validateCourse("GPT");
                                break;
                            case 2:
                                valid = contexto.validateCourse("BLOCKCHAIN");
                                break;
                            case 3:
                                valid = contexto.validateCourse("IOT");
                                break;
                            case 4:
                                valid = contexto.validateCourse("VR");
                                break;
                            default:
                                System.out.println("Curso inválido");
                                continue;
                        } 

                        if (valid) {
                            System.out.println("Curso escolhido com sucesso");
                        }

                        else {
                            System.out.println("Curso indisponível");
                            continue;
                        }
                    }
                    
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            else if (contexto.getState() instanceof Processing) {
                sc.nextLine();
                System.out.print("Digite o número do cartão de crédito (5 dígitos): ");
                String numero = sc.nextLine();
                System.out.print("Digite o nome do titular do cartão: ");
                String nome = sc.nextLine();
                System.out.print("Digite o código de segurança do cartão (3 dígitos): ");
                String codigo = sc.nextLine();
                System.out.print("Digite a validade do cartão: ");
                String mes = sc.nextLine();
            
                CreditCard cartao = new CreditCard(numero, nome, mes, codigo);
                try {
                    boolean valido = contexto.validateCreditCard(cartao);
                    if (valido) {
                        System.out.println("Cartão validado com sucesso!");
                    } else {
                        System.out.println("Cartão inválido");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            else if (contexto.getState() instanceof Subscribed) {
                try {
                    System.out.println("Ticket criado: " + contexto.createTicket());

                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                    continue;
                }
            }

            else {
                contexto.changeState();
            }
        }
    }
}