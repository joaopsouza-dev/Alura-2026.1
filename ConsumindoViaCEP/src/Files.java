import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class Files {

    public void saveFile(Data data) {

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter file;

        {
            try {

                file = new FileWriter(data.cep() + ".json");
                file.write(gson.toJson(data));
                file.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
