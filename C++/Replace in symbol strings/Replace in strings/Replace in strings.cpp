
// Символьное не сработало, увы, дурацкий C++
// Пытался, но замена подстроки неопределенной длины это невозможно

#include <iostream>
#include <string>
#define _CRT_SECURE_NO_WARNINGS
using namespace std;



const short int all_str_len = 300;

int main()
{
    setlocale(LC_ALL, "Russian");

    int user_choice = 0;
    while (1)
    {
        cout << "0 - посимвольные(char[]) строки\n1 - строки из библиотеки <string>\nВыбор: ";
        cin >> user_choice;
        cout << "Введите строку: ";

        if (user_choice == 0)
        {
            
            char str0[all_str_len];
            char old_tmp_str0[all_str_len];
            char new_tmp_str0[all_str_len];
            char new_str0[all_str_len*2];

            cin >> str0;
            cout << "Введите подстроку, которую вы хотите заместить: ";
            cin >> old_tmp_str0;
            cout << "Введите подстроку, на которую вы хотите заменить: ";
            cin >> new_tmp_str0;
            short int tmp_str0_len = strlen(old_tmp_str0);

            for (int i = 0; i < strlen(str0) - tmp_str0_len; i++)
            {
                if (str0[i] == old_tmp_str0[i])
                {
                    short int captions = 0;
                    for (int k = 0; k < tmp_str0_len; k++)
                    {
                        if (str0[i + k] == old_tmp_str0[i + k]) captions += 1;
                    }

                    if (captions == tmp_str0_len)
                    {
                        strcat_s(new_str0, new_tmp_str0);
                        i += tmp_str0_len;
                    }
                    continue;
                }
                strcat_s(new_str0, "gg");
            }
            cout << new_str0;
        }
    }
    return 0;
}

