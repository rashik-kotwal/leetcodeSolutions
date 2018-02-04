static boolean[] mark;
        public static void fun(String substr, String S)
        {
            int j=0,i;
            while(true)
            {
                while(j<S.length()) {
                    int index = S.indexOf(substr,j);
                    if(index==-1)
                        return;
                    for (i = index; i < index + substr.length(); i++)
                        mark[i] = true;
                    j++;
                }
                if(j==S.length())
                    return ;
            }
        }

        public static String boldWords(String[] words, String S)
        {
            mark = new boolean[S.length()];         //initially all false
            //mark the words
            for(int i=0;i<words.length;i++)
            {
                fun(words[i],S);
            }

            boolean flag=false;         //will be true after startTag and false after endTag
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<S.length();i++)
            {
                if(mark[i]==false)
                {
                    if(flag==false)
                        sb.append(S.charAt(i));
                    else
                    {
                        //end Tag
                        sb.append("</b>");
                        sb.append(S.charAt(i));
                        flag=false;
                    }
                }
                else if(mark[i]==true)
                {
                    if(flag==false)
                    {
                        sb.append("<b>");
                        sb.append(S.charAt(i));
                        flag=true;
                    }
                    else
                    {
                        sb.append(S.charAt(i));
                    }
                }
            }

            if(flag==true)
                sb.append("</b>");

                return sb.toString();
        }
