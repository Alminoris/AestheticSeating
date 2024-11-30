package net.alminoris.aestheticseating.util.helper;

import net.alminoris.aestheticseating.AestheticSeating;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModJsonHelper
{
    public static void createSimpleChairModel(String jsonContent, String colorName, String woodName, boolean isReclined, boolean isCarpeted)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/" + colorName;

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_chair_" + woodName + (isReclined ? "_reclined" : "") + (isCarpeted ? "_carpeted" : "") + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("COLOR_NAME_VALUE", colorName).replace("WOOD_NAME_VALUE", woodName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleChairBlockState(String woodName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_chair_" + woodName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SIMPLE_CHAIR_BLOCKSTATE_TEMPLATE.replace("WOOD_NAME_VALUE", woodName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSetteeModel(String jsonContent, String colorName, boolean isTransformed, int variant)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "settee_" + colorName + (isTransformed ? "_transformed" : "") + "_" + variant + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("COLOR_NAME_VALUE", colorName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSetteeBlockState(String colorName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "settee_" + colorName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SETTEE_BLOCKSTATE_TEMPLATE.replace("COLOR_NAME_VALUE", colorName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createCushionModel(String colorName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "cushion_" + colorName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.CUSHION_MODEL_TEMPLATE.replace("COLOR_NAME_VALUE", colorName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleStoolModel(String jsonContent, String colorName, String woodName, String form, boolean isCarpeted)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/models/block/" + colorName;

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_stool_" + form + "_" + woodName + (isCarpeted ? "_carpeted" : "") + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("COLOR_NAME_VALUE", colorName).replace("WOOD_NAME_VALUE", woodName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createSimpleStoolBlockState(String woodName)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("build\\datagen", "src\\main\\resources") + "/assets/"+ AestheticSeating.MOD_ID+"/blockstates";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = "simple_stool_" + woodName + ".json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.SIMPLE_STOOL_BLOCKSTATE_TEMPLATE.replace("WOOD_NAME_VALUE", woodName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
