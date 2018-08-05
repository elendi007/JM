package level.three.lessonFive;

public class Main {
    public static void main(String[] args){
        String[] roles = new String[4];
        roles[0] = "Городничий";
        roles[1] = "Аммос Федорович";
        roles[2] = "Артемий Филиппович";
        roles[3] = "Лука Лукич";

        String[] textLines = new String[7];
        textLines[0] = "Городничий: Я пригласил вас, господа, с тем," +
                "чтобы сообщить вам пренеприятное известие: к нам едет ревизор.";
        textLines[1] = "Аммос Федорович: Как ревизор?";
        textLines[2] = "Артемий Филиппович: Как ревизор?";
        textLines[3] = "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.";
        textLines[4] = "Аммос Федорович: Вот те на!";
        textLines[5] = "Артемий Филиппович: Вот не было заботы, так подай!";
        textLines[6] = "Лука Лукич: Господи боже! еще и с секретным предписаньем!";

        System.out.println(printTextPerRole(roles, textLines));
    }

    private static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder textPerRole = new StringBuilder();

        for (int i = 0; i < roles.length; i++) {
            textPerRole.append(roles[i] + ":\n");
            for (int j = 0; j < textLines.length; j++) {
                if(textLines[j].startsWith(roles[i] + ":")){
                    textPerRole.append((j + 1) + ")" + textLines[j].substring(1 + textLines[j].indexOf(':')) + "\n");
                }
            }
            textPerRole.append("\n");
        }

        return textPerRole.toString();
    }
}

//
//        Городничий:
//        1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
//        4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
//
//        Аммос Федорович:
//        2) Как ревизор?
//        5) Вот те на!
//
//        Артемий Филиппович:
//        3) Как ревизор?
//        6) Вот не было заботы, так подай!
//
//        Лука Лукич:
//        7) Господи боже! еще и с секретным предписаньем!