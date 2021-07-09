
 


            int rts1 = (int)rts;

            int rts2 = (int)(((decimal)rts % 1) * 10);



            float ftime = Math.Round(ftime, 2);


            double rtsc = ftime;

            float d = (float)Math.Round(rtsc, 2);


            int f1d = (int)d;

            int f2d = (int)(((decimal)d % 1) * 10);


            if ((rts + 4) > 9)
            {

            }


            if (e3s == 1)
            {
                    
                e3s = 2;
            }



            if (e3s == 2 && (((rts2 + 2) > 9 ? rts1 + 1 : rts1) == f1d && ((rts2 + 2) > 9 ? ((rts2 + 2) - 10) : (rts2 + 2)) == f2d))
            {
              
                e3s = 3;
            }


            if (e3s == 3 && (((rts2 + 4) > 9 ? rts1 + 1 : rts1) == f1d && ((rts2 + 4) > 9 ? ((rts2 + 4) - 10) : (rts2 + 4)) == f2d))
            {
               
                e3s = 4;
            }


            if (e3s == 4 && (((rts2 + 6) > 9 ? rts1 + 1 : rts1) == f1d && ((rts2 + 6) > 9 ? ((rts2 + 6) - 10) : (rts2 + 6)) == f2d))
            {
              
                e3s = 5;
            }


            if (e3s == 5 && (((rts2 + 8) > 9 ? rts1 + 1 : rts1) == f1d && ((rts2 + 8) > 9 ? ((rts2 + 8) - 10) : (rts2 + 8)) == f2d))
            {
               

                e3s = 6;


            }

            if (e3s == 6 && (((rts2 + 10) > 9 ? rts1 + 1 : rts1) == f1d && ((rts2 + 10) > 9 ? ((rts2 + 10) - 10) : (rts2 + 10)) == f2d))
            {
              
                e3s = 7;

                etime = 0;
            }

    






