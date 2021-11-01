/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Models.JobModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import weka.classifiers.trees.J48;
import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.TechnicalInformation;
import weka.core.converters.CSVLoader;

/**
 *
 * @author UnmatchedTaiNguyen
 */
public class JobDecisionTree {

    public Instances trainingData;

    public static void main(String[] args) {

        try {

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public String GetValue(int result){
       return trainingData.attribute(7).value(result);
    }
    public int TestData(Instance in) {
        J48 tree = performTraining();
        try {
            return (int) tree.classifyInstance(in);
        } catch (Exception ex) {
            Logger.getLogger(JobDecisionTree.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public JobDecisionTree(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            fileName = "./Data/dataTrain.csv";
        }
        CSVLoader loader = new CSVLoader();

        try {
            loader.setSource(new File(fileName));
            trainingData = loader.getDataSet();
//            trainingData.setClassIndex(trainingData.numAttributes() - 1);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public J48 performTraining() {
        CustomJ48 j48 = new CustomJ48();
        String[] options = {"-U"};

        try {
            j48.setOptions(options);
            j48.buildClassifier(trainingData);
            j48.Test();
            System.out.print(j48.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return j48;
    }

    public Instance getTestInstance(JobModel Job) {
        Instance instance = new DenseInstance(3);
        instance.setDataset(trainingData);

        return instance;
    }
}
