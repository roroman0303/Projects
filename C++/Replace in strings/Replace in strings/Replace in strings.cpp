// Символьное не сработало, увы, дурацкий C++
// Зато с библиотекой еще как сработало =)

#include <iostream>
#include <string>
using namespace std;

int main()
{
    setlocale(LC_ALL, "Russian");

    int user_choice = 0;
    while (1)
    {
        string str0;
        string old_tmp_str0;
        string new_tmp_str0;
        string new_str0;

        cout << "Введите строку: ";
        cin >> str0;
        cout << "Введите подстроку, которую вы хотите заместить: ";
        cin >> old_tmp_str0;
        int str_len = size(old_tmp_str0);
        cout << "Введите подстроку, на которую вы хотите заменить: ";
        cin >> new_tmp_str0;

        while (1)
        {
            int pos = str0.find(old_tmp_str0);
            if (pos != -1)
            {
                str0.replace(pos, str_len, new_tmp_str0);
            }
            else break;
        }
        cout << str0 << endl;
    }
    return 0;
}

