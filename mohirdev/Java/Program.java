using System;

class Program
{
    static void Main()
    {
        string[] participants = new string[5]; // Change the size to 5
        string[] competitionNames = new string[5];
        int[] maxScores = new int[5];
        int[,] scores = new int[5, 5]; // Change the size to 5
        int[,] cupCounts = new int[5, 2]; // Change the size to 5

        int participantCount = 0;
        int competitionCount = 0;

        Console.WriteLine("Jamoa yoki yakka ishtirokni tanlang:");
        Console.WriteLine("1. Jamoa(5ta jamoa 5 kishidan)"); // Change the message to 5 participants
        Console.WriteLine("2. Yakka ishtirokchilar(20 ta)");

        int tournamentType;
        while (true)
        {
            while (!int.TryParse(Console.ReadLine(), out tournamentType)  (tournamentType != 1 && tournamentType != 2))
            {
                Console.WriteLine("Noto'g'ri kirish. Qaytadan kiriting.");
            }

            while (true)
            {
                Console.WriteLine("Menyu:");
                Console.WriteLine("1. Ishtirokchi qushish");
                Console.WriteLine("2. Musobaqa qoshish");
                Console.WriteLine("3. Musobaqani boshlash");
                Console.WriteLine("4. Chiqish");

                int choice;
                while (!int.TryParse(Console.ReadLine(), out choice)  choice < 1 || choice > 4)
                {
                    Console.WriteLine("Noto'g'ri kirish. Qaytadan kiriting.");
                }

                switch (choice)
                {
                    case 1:
                        if (participantCount + 5 > participants.Length)
                        {
                            Console.WriteLine("Xatolik! Ishtirokchi qushish uchun joy qolmadi.");
                            break;
                        }

                        Console.Write("Birinchi ishtirokchi ismini kiriting: ");
                        participants[participantCount] = Console.ReadLine();
                        participantCount++;

                        Console.Write("Ikkinchi ishtirokchi ismini kiriting: ");
                        participants[participantCount] = Console.ReadLine();
                        participantCount++;

                        Console.Write("Uchinchi ishtirokchi ismini kiriting: ");
                        participants[participantCount] = Console.ReadLine();
                        participantCount++;

                        Console.Write("To'rtinchi ishtirokchi ismini kiriting: ");
                        participants[participantCount] = Console.ReadLine();
                        participantCount++;

                        Console.Write("Beshinchi ishtirokchi ismini kiriting: ");
                        participants[participantCount] = Console.ReadLine();
                        participantCount++;
                        break;

                    // ... (rest of the code remains the same)
                }
            }
        }
    }
}